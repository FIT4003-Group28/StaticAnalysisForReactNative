package defpackage;

import android.text.SpannableStringBuilder;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: azbj  reason: default package */
/* loaded from: classes3.dex */
public class azbj extends azcu {
    public final baal a;
    public final bvqg<baal> b;
    private final gga f;
    private final Executor g;
    private final aymh h;
    private final axwi i;
    private final baad j;

    public azbj(gga ggaVar, btvo btvoVar, Executor executor, aymh aymhVar, axwi axwiVar, baal baalVar, bvqg<baal> bvqgVar) {
        super(ggaVar, baalVar.c());
        this.f = ggaVar;
        this.g = executor;
        this.h = aymhVar;
        this.i = axwiVar;
        baad b = baalVar.b();
        dbsk.s(b);
        this.j = b;
        this.a = baalVar;
        this.b = bvqgVar;
    }

    @Override // defpackage.azbe
    public CharSequence b() {
        return this.a.y(this.f);
    }

    @Override // defpackage.azbe
    public CharSequence c() {
        return new SpannableStringBuilder().append((CharSequence) this.j.E(this.f)).append((CharSequence) " · ").append(this.h.j(this.j));
    }

    @Override // defpackage.azbe
    public CharSequence e() {
        return this.f.getString(R.string.ADD_OR_EDIT_NOTE_PLACEHOLDER);
    }

    @Override // defpackage.azcu
    protected final String g() {
        return this.f.getString(this.d.length() == 0 ? R.string.ADD_NOTE : R.string.EDIT_NOTE);
    }

    @Override // defpackage.azcu
    protected final cjtd h() {
        return cjtd.a(dtyb.s);
    }

    @Override // defpackage.azcu
    protected final cjtd i() {
        return cjtd.a(dtyb.t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.azcu
    public final void j() {
        if (!k()) {
            this.b.NU(null);
            return;
        }
        this.a.d(d().toString());
        bvqj.c(this.i.j(this.j), new bvqg(this) { // from class: azbi
            private final azbj a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                azbj azbjVar = this.a;
                azbjVar.b.NU(((baad) obj).d(azbjVar.a.a()));
            }
        }, this.g);
    }
}
