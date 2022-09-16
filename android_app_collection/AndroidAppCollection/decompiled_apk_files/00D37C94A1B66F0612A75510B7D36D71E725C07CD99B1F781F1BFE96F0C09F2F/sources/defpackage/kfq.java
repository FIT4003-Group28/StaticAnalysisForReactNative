package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kfq  reason: default package */
/* loaded from: classes3.dex */
public final class kfq extends ahyf implements ynl {
    public boolean a;

    public kfq(Context context) {
        super(context);
        this.a = false;
    }

    @Override // defpackage.ahyl
    public final View a(Context context) {
        return View.inflate(context, R.layout.pip_ad_overlay, null);
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final void d(Context context, View view) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahyf
    public final ahyk kS(Context context) {
        ahyk kS = super.kS(context);
        kS.b();
        kS.a = 0;
        kS.a();
        kS.b = 0;
        return kS;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                boolean h = ((ahhw) obj).c().h();
                this.a = h;
                if (h) {
                    kU();
                    return null;
                }
                kT();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.a;
    }
}
