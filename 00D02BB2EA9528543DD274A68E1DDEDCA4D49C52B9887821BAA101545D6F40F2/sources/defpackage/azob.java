package defpackage;

import android.database.Cursor;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azob  reason: default package */
/* loaded from: classes3.dex */
public final class azob implements aznm<Long> {
    final /* synthetic */ azwm a;
    final /* synthetic */ azxm b;
    final /* synthetic */ String c;
    final /* synthetic */ azof d;

    public azob(azof azofVar, azwm azwmVar, azxm azxmVar, String str) {
        this.d = azofVar;
        this.a = azwmVar;
        this.b = azxmVar;
        this.c = str;
    }

    @Override // defpackage.aznm
    public final /* bridge */ /* synthetic */ Long a() {
        aznp f;
        azwl azwlVar = this.a.j;
        dbsk.s(azwlVar);
        String str = azwlVar.b;
        try {
            aznp aznpVar = null;
            if (!dbsj.d(str)) {
                azxl b = this.b.b();
                if (str == null) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Cannot retrieve an item with serverId=null for corpus=%s", b.name()));
                }
                String[] strArr = {Integer.toString(b.n), str};
                synchronized (aznn.class) {
                    Cursor c = aznn.c("corpus = ? AND server_id = ? ", strArr, null);
                    if (!aznn.d(c)) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Item for corpus=%s, serverId=%s not found", b.name(), str));
                    }
                    f = aznn.f(c);
                    if (c != null) {
                        c.close();
                    }
                }
                aznpVar = f;
            }
            if (aznpVar != null && aznpVar.e != aznl.SYNCED && aznpVar.d > this.a.q()) {
                return 0L;
            }
        } catch (IllegalArgumentException unused) {
        }
        return Long.valueOf(aznn.q(azof.n(this.b, this.a, this.c, aznl.SYNCED)));
    }
}
