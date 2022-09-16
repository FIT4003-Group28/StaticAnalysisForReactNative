package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: vda  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vda implements Runnable {
    public final /* synthetic */ vbk a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ vda(vbk vbkVar, String str) {
        this.a = vbkVar;
        this.b = str;
    }

    public /* synthetic */ vda(vbk vbkVar, String str, int i) {
        this.c = i;
        this.a = vbkVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] listFiles;
        if (this.c == 0) {
            vbk vbkVar = this.a;
            String str = this.b;
            ArrayList arrayList = new ArrayList();
            arrayList.add(vbkVar.g);
            if (sre.f()) {
                arrayList.add(sre.a(vbkVar.g));
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String valueOf = String.valueOf(((Context) arrayList.get(i)).getFilesDir().toPath());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                sb.append(valueOf);
                sb.append("/phenotype/shared");
                File file = new File(sb.toString());
                if (file.exists()) {
                    for (File file2 : file.listFiles(new vcz(str))) {
                        if (str.length() != 0) {
                            "Removing leftover snapshots for removed package: ".concat(str);
                        }
                        file2.delete();
                    }
                }
            }
            return;
        }
        vbk vbkVar2 = this.a;
        String str2 = this.b;
        if (!twx.g() || vdq.f(vbkVar2.g).containsKey(str2)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 183);
        sb2.append("Config package ");
        sb2.append(str2);
        sb2.append(" cannot use ProtoDataStore backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
        Log.e("PhenotypeCombinedFlags", sb2.toString());
    }
}
