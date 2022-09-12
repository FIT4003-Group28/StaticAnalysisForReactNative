package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: bhsn  reason: default package */
/* loaded from: classes3.dex */
public class bhsn implements bhrz {
    public final cjtd a;
    private final dcdc<bhsl> b;
    private final View.OnAttachStateChangeListener c;

    public bhsn(dcdc<bhsl> dcdcVar, bvpe bvpeVar, huc hucVar) {
        cjta b = cjtd.b();
        b.d = dtxx.I;
        this.a = b.a();
        this.b = dcdcVar;
        this.c = new bvob(bvpeVar.b, hucVar.a(new htz(this) { // from class: bhsm
            private final bhsn a;

            {
                this.a = this;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a.a;
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        }));
    }

    @Override // defpackage.bhrz
    public Boolean a() {
        return false;
    }

    @Override // defpackage.bhrz
    public cqkl b() {
        return cqkl.a;
    }

    @Override // defpackage.bhrz
    public View.OnAttachStateChangeListener c() {
        return this.c;
    }

    @Override // defpackage.bhrz
    public cjtd d() {
        return this.a;
    }

    @Override // defpackage.bhrz
    @dzsi
    public cjtd e() {
        return null;
    }

    @Override // defpackage.bhsa
    public List<? extends bhry> f() {
        return this.b;
    }

    @Override // defpackage.bhsa
    public Boolean g() {
        return false;
    }

    @Override // defpackage.bhsa
    public Boolean h() {
        return false;
    }

    @Override // defpackage.bhsa
    public cqkl i() {
        return cqkl.a;
    }
}
