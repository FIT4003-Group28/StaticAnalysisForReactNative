package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: PG */
/* renamed from: bhj  reason: default package */
/* loaded from: classes2.dex */
public final class bhj implements Runnable {
    private final /* synthetic */ int i;
    public static final /* synthetic */ bhj h = new bhj(20);
    public static final /* synthetic */ bhj g = new bhj(19);
    public static final /* synthetic */ bhj f = new bhj(18);
    public static final /* synthetic */ bhj e = new bhj(17);
    public static final /* synthetic */ bhj d = new bhj(16);
    public static final /* synthetic */ bhj c = new bhj(15);
    public static final /* synthetic */ bhj b = new bhj(14);
    public static final /* synthetic */ bhj a = new bhj(13);

    public bhj() {
        throw new UnsupportedOperationException();
    }

    public bhj(int i) {
        this.i = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.i;
        if (i != 0) {
            if (i == 8) {
                int i2 = arhr.ACCEPT_FRIEND_INVITE.pS;
                return;
            } else if (i == 12) {
                try {
                    Class.forName("com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity");
                    return;
                } catch (ClassNotFoundException unused) {
                    return;
                }
            } else if (i == 15) {
                amup amupVar = hsq.a;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                try {
                    Class.forName("com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity");
                    return;
                } catch (ClassNotFoundException unused2) {
                    return;
                }
            } else {
                try {
                    dru.b = MessageDigest.getInstance("MD5");
                    return;
                } catch (NoSuchAlgorithmException unused3) {
                    return;
                } finally {
                    dru.c.countDown();
                }
            }
        }
        throw null;
    }
}
