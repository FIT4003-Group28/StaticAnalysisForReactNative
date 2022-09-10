package defpackage;

import java.io.File;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: afam  reason: default package */
/* loaded from: classes2.dex */
final class afam implements crzp<btvo> {
    final /* synthetic */ afas a;

    public afam(afas afasVar) {
        this.a = afasVar;
    }

    private static final void b(File file, String str, boolean z) {
        File file2 = new File(file, str);
        if (z != file2.exists()) {
            if (z) {
                int i = afas.j;
                file2.getName();
                try {
                    file2.createNewFile();
                    return;
                } catch (IOException unused) {
                    file2.getName();
                    return;
                }
            }
            int i2 = afas.j;
            file2.getName();
            file2.delete();
        }
    }

    @Override // defpackage.crzp
    public final void On(crzm<btvo> crzmVar) {
        btvo l = crzmVar.l();
        dbsk.s(l);
        if (this.a.c.a().d() && l.getIncognitoParameters().b) {
            this.a.e(false);
        }
        File file = new File(new File(this.a.a.getApplicationContext().getFilesDir().getParentFile(), "no_backup"), "incognito");
        file.mkdirs();
        b(file, "enableIncognitoV2_contextWrap", l.getIncognitoParameters().d);
        b(file, "enableIncognitoV2_fileIsolation", l.getIncognitoParameters().e);
    }
}
