package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: PG */
/* renamed from: awye  reason: default package */
/* loaded from: classes2.dex */
public final class awye implements awxz {
    @Override // defpackage.awxz
    public final awyp a(String str, String str2, awya awyaVar, awxx awxxVar) {
        try {
            return new awyd((HttpURLConnection) new URL(str).openConnection(), str2, awyaVar, awxxVar);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Url is malformed.", e);
        } catch (IOException e2) {
            throw new IllegalStateException("Http connection could not be created.", e2);
        }
    }
}
