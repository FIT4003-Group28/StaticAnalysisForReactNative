package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Picture;
/* compiled from: PG */
/* renamed from: bvly  reason: default package */
/* loaded from: classes.dex */
public class bvly {
    private final bvlu a;

    public bvly(bvlu bvluVar) {
        this.a = bvluVar;
    }

    public static bvly a() {
        return ((bvlz) btsr.a(bvlz.class)).sG();
    }

    public final Picture b(final Resources resources, final int i) {
        Picture a;
        bvlu bvluVar = this.a;
        dbty dbtyVar = new dbty(resources, i) { // from class: bvlx
            private final Resources a;
            private final int b;

            {
                this.a = resources;
                this.b = i;
            }

            @Override // defpackage.dbty
            public final Object a() {
                bvlg bvlgVar = new bvlg(this.a, this.b);
                dxeh dxehVar = new dxeh();
                dxehVar.b();
                dxehVar.a = bvlgVar.a.openRawResource(bvlgVar.b);
                dxehVar.b = true;
                return dxehVar.a().a;
            }
        };
        bvlc bvlcVar = new bvlc(new Configuration(resources.getConfiguration()), i);
        synchronized (bvluVar.a) {
            a = bvluVar.a.a(bvlcVar);
            if (a == null) {
                a = bvluVar.c.c(bvlcVar);
                if (a == null) {
                    a = (Picture) dbtyVar.a();
                }
                bvluVar.a.Pz(bvlcVar, a);
            }
            bvluVar.c.d(bvlcVar, a);
        }
        return a;
    }
}
