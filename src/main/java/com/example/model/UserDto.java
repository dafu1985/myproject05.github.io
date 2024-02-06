package com.example.model;  // このファイルが属するパッケージ（フォルダ）

// 入力チェックをするためのツールをインポートしています。
import jakarta.validation.constraints.NotEmpty;

public class UserDto {  // ユーザーのデータを扱うためのクラス

    @NotEmpty  // ユーザー名は空であってはならないというルール
    private String username;  // ユーザー名を保存するための場所

    @NotEmpty  // パスワードは空であってはならないというルール
    private String password;  // パスワードを保存するための場所

    @NotEmpty  // メールアドレスは空であってはならないというルール
    private String email;  // メールアドレスを保存するための場所

    // 以下は各値を取得するためのメソッド（ゲッター）です。
    public String getUsername() {
        return username;  // ユーザー名を返す
    }

    public void setUsername(String username) {
        this.username = username;  // ユーザー名を設定する
    }

    public String getPassword() {
        return password;  // パスワードを返す
    }

    public void setPassword(String password) {
        this.password = password;  // パスワードを設定する
    }

    public String getEmail() {
        return email;  // メールアドレスを返す
    }

    public void setEmail(String email) {
        this.email = email;  // メールアドレスを設定する
    }
}

/**
 * ユーザーのデータを表現するためのクラス。
 * 状況によってはエンティティクラスもしくはDTOとも呼ばれます。
 * ここでは、例えばデータベースのテーブルにUsersテーブルが存在する場合は
 * User.javaというファイルを作成し、ユーザー名とパスワードを格納する変数を用意することで、
 * テーブルとJavaを紐付けすることができます
 * 
 * ユーザーによる入力データを保持するためのクラスです。
 * ユーザーがフォームに入力したデータが、このクラスのインスタンスに変換され、
 * アプリケーション内で利用されます。
 * @NotEmptyアノテーションは入力値チェックを行い、
 * 対象のフィールドが空でないことを確認します。
 * これにより、ユーザーが空欄のままデータを送信するのを防ぎます。
 * 
 */