package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahcw  reason: default package */
/* loaded from: classes2.dex */
public class ahcw implements agzf, agyz {
    public final ahcu a;
    private final gga b;
    private final List<dlay> c;

    public ahcw(gga ggaVar, ahcu ahcuVar, List<dlay> list) {
        this.b = ggaVar;
        this.a = ahcuVar;
        this.c = list;
    }

    @Override // defpackage.agzf
    public List<agze> a() {
        return dchl.k(this.c, new dbrn(this) { // from class: ahcv
            private final ahcw a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dlay dlayVar = (dlay) obj;
                gga a = this.a.a.a.a();
                ahcu.a(a, 1);
                ahcu.a(dlayVar, 2);
                return new ahct(a, dlayVar);
            }
        });
    }

    @Override // defpackage.agyz
    public cqkl g() {
        this.b.g().f();
        return cqkl.a;
    }

    @Override // defpackage.agyz
    public CharSequence h() {
        return this.b.getString(R.string.LOCALSTREAM_FOLLOW_MANAGEMENT_RELATED_EMAILS_HEADER_TEXT);
    }
}
