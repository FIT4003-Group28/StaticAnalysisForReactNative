package defpackage;

import android.text.SpannableStringBuilder;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: azbg  reason: default package */
/* loaded from: classes3.dex */
public class azbg extends azcu {
    public final bvqg<baad> a;
    private final gga b;
    private final Executor f;
    private final aymh g;
    private final axwi h;
    private final baad i;

    public azbg(gga ggaVar, btvo btvoVar, Executor executor, aymh aymhVar, axwi axwiVar, baad baadVar, bvqg<baad> bvqgVar) {
        super(ggaVar, baadVar.G());
        this.b = ggaVar;
        this.f = executor;
        this.g = aymhVar;
        this.h = axwiVar;
        this.i = baadVar;
        this.a = bvqgVar;
    }

    @Override // defpackage.azbe
    public CharSequence b() {
        return this.i.E(this.b);
    }

    @Override // defpackage.azbe
    public CharSequence c() {
        return new SpannableStringBuilder().append(this.g.j(this.i));
    }

    @Override // defpackage.azbe
    public CharSequence e() {
        return this.b.getString(R.string.ADD_LIST_DESCRIPTION_HINT_TEXT);
    }

    @Override // defpackage.azcu
    protected final String g() {
        return this.b.getString(this.d.length() == 0 ? R.string.ADD_LIST_DESCRIPTION_TOOLBAR_TITLE : R.string.EDIT_LIST_DESCRIPTION_TOOLBAR_TITLE);
    }

    @Override // defpackage.azcu
    protected final cjtd h() {
        return cjtd.a(dtyb.l);
    }

    @Override // defpackage.azcu
    protected final cjtd i() {
        return cjtd.a(dtyb.m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.azcu
    public final void j() {
        if (!k()) {
            this.a.NU(null);
            return;
        }
        this.i.H(d().toString());
        bvqj.c(this.h.j(this.i), new bvqg(this) { // from class: azbf
            private final azbg a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.a.NU((baad) obj);
            }
        }, this.f);
    }
}
