package defpackage;

import android.content.Context;
import com.google.android.filament.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: olh  reason: default package */
/* loaded from: classes7.dex */
public class olh extends cqiw<oxp> {
    public static final cqjg a = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, oxp oxpVar, Context context, cqiv cqivVar) {
        List<jba> b = oxpVar.b();
        int min = Math.min(d(), b.size());
        for (int i2 = 0; i2 < min; i2++) {
            if (i2 != 0) {
                cqivVar.a(new olg(), b.get(i2));
            }
            cqivVar.a(new olf(), b.get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<oxp> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bq(cqrp.d(e())), cqgr.aF(cqjv.x(ola.a)), cqgr.ck(C()));
    }

    protected int d() {
        return 2;
    }

    protected int e() {
        return R.styleable.AppCompatTheme_windowMinWidthMinor;
    }
}
