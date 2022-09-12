package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahdf  reason: default package */
/* loaded from: classes2.dex */
public class ahdf extends agxc implements agzg {
    public static final /* synthetic */ int a = 0;
    private final bvip b;

    public ahdf(gga ggaVar, cqhn cqhnVar, bviq bviqVar, List<bvik> list, CharSequence charSequence, long j, int i, cjta cjtaVar) {
        bvim g = bvin.g();
        g.b(ggaVar.getString(R.string.LOCALSTREAM_ACCESSIBILITY_SEE_PREVIOUS_PHOTO, new Object[]{charSequence}));
        g.c(ggaVar.getString(R.string.LOCALSTREAM_ACCESSIBILITY_SEE_NEXT_PHOTO, new Object[]{charSequence}));
        g.g(cjtaVar.b(dtxu.bA));
        this.b = bviqVar.a(dcbg.b(list).s(ahdd.a).z(), i, new bvio(j), new bvil(this) { // from class: ahde
            private final ahdf a;

            {
                this.a = this;
            }

            @Override // defpackage.bvil
            public final void a() {
                cqkx.p(this.a);
            }
        }, g.a());
    }

    @Override // defpackage.agzg
    public bvhu a() {
        return this.b;
    }

    public int b() {
        return this.b.k().intValue();
    }

    public void c() {
        this.b.n();
    }

    public void h() {
        this.b.o();
    }
}
