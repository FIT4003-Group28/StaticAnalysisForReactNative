package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: PG */
/* renamed from: duic  reason: default package */
/* loaded from: classes6.dex */
public final class duic {
    private final int a;
    private final int b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public duic() {
        this(300000, 300000);
        new duhz();
    }

    public duic(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final duio a(String str, String str2, duhx duhxVar, @dzsi duhv duhvVar) {
        try {
            return new duib((HttpURLConnection) new URL(str).openConnection(), str2, duhxVar, duhvVar, this.a, this.b);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Url is malformed.", e);
        } catch (IOException e2) {
            throw new IllegalStateException("Http connection could not be created.", e2);
        }
    }
}
