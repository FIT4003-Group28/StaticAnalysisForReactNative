package okhttp3;
/* loaded from: classes.dex */
public interface Interceptor {

    /* loaded from: classes.dex */
    public interface Chain {
        Connection connection();

        Response proceed(Request request);

        Request request();
    }

    Response intercept(Chain chain);
}
