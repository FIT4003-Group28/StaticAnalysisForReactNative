package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ebh  reason: default package */
/* loaded from: classes3.dex */
public final class ebh extends ajsl {
    public apzg a;
    private final View b;

    public ebh(Context context, aafo aafoVar) {
        View inflate = View.inflate(context, R.layout.sign_in_promo, null);
        this.b = inflate;
        inflate.setOnClickListener(new ebg(this, aafoVar));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar = ((auvy) obj).b;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        this.a = apzgVar;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auvy) obj).c.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
