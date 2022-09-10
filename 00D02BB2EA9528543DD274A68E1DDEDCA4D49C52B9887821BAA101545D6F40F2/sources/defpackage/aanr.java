package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aanr  reason: default package */
/* loaded from: classes2.dex */
public class aanr implements aani {
    public final dxio<caym> a;
    private final cbqg d;
    @dzsi
    public dijn b = null;
    public dive c = dive.d;
    private boolean e = false;
    private String f = "";

    public aanr(dxio<caym> dxioVar, cbqg cbqgVar) {
        this.a = dxioVar;
        this.d = cbqgVar;
    }

    @Override // defpackage.aani
    public View.OnClickListener a() {
        return new View.OnClickListener(this) { // from class: aanq
            private final aanr a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aanr aanrVar = this.a;
                dijn dijnVar = aanrVar.b;
                if (dijnVar != null) {
                    aanrVar.a.a().b(dijnVar, aanrVar.c);
                }
            }
        };
    }

    @Override // defpackage.aani
    public cjtd b() {
        cjta b = cjtd.b();
        b.d = dtxo.aH;
        if (!dbsj.d(this.f)) {
            b.g(this.f);
        }
        return b.a();
    }

    @Override // defpackage.aakt
    public Boolean c() {
        boolean z = false;
        if (this.d.a() && this.e) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void d(diwb diwbVar) {
        this.e = (diwbVar.b & 32) != 0;
        ditt dittVar = diwbVar.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        this.f = dittVar.b;
        dijn dijnVar = diwbVar.I;
        if (dijnVar == null) {
            dijnVar = dijn.e;
        }
        this.b = dijnVar;
        dive diveVar = diwbVar.v;
        if (diveVar == null) {
            diveVar = dive.d;
        }
        this.c = diveVar;
    }
}
