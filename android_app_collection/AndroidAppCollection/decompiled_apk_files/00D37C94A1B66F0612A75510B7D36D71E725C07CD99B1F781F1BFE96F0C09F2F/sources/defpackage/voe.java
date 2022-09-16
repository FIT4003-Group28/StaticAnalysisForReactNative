package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: voe  reason: default package */
/* loaded from: classes4.dex */
public final class voe implements ankb {
    final /* synthetic */ vok a;
    private final /* synthetic */ int b;

    public voe(vok vokVar) {
        this.a = vokVar;
    }

    public voe(vok vokVar, int i) {
        this.b = i;
        this.a = vokVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (this.b == 0) {
            if (new File(((SQLiteDatabase) obj).getPath()).exists()) {
                return;
            }
            synchronized (this.a.i) {
                this.a.d();
            }
            return;
        }
        new File(this.a.b.getDatabasePath((String) obj).getPath().concat(".bak")).delete();
    }
}
