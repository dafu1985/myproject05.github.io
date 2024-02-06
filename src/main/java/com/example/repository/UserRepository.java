package com.example.repository;  // このファイルが属するパッケージ（フォルダ）

// 必要なツールをインポートしています
import org.springframework.data.jpa.repository.JpaRepository;

// Userクラスを使うためにインポートしています
import com.example.model.User;

// UserRepositoryというインターフェースを作成します。JpaRepositoryを拡張して、UserオブジェクトとそれらのIDとしてLong(Integer)型を扱えるようにします。
public interface UserRepository extends JpaRepository<User, Integer> {
    // ユーザー名でユーザーを探すメソッド。ユーザー名をパラメータとして渡すと、そのユーザー名を持つユーザーをデータベースから探して返します。
	User findByUsername(String username);
}

/**
 * ユーザーデータの保存や検索を行うためのインターフェース。
 * Spring Data JPAを使用して、データベース操作を簡単に実行できます。
JPAとはテーブルのカラムとJavaの変数を紐付けする機能です。
使用するにはSpring Securityと同じように依存関係の設定が必要になります
*
*このインターフェースは、
*Userエンティティに対してデータベース操作を行うためのリポジトリを定義しています。
*JpaRepositoryを継承することで、様々なデータベース操作を自動的に提供します
*（例えば、保存、更新、削除、検索など）。
*findByUsernameメソッドは、指定したユーザー名でユーザーを検索するためのメソッドで、
*Spring Data JPAが自動的にその実装を生成します。
*
 */
