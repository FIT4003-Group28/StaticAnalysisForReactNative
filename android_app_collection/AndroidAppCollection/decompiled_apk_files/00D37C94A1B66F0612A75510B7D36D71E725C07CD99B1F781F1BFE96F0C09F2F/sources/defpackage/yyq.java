package defpackage;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
/* compiled from: PG */
/* renamed from: yyq  reason: default package */
/* loaded from: classes4.dex */
public final class yyq extends yyj {
    protected final Context a;
    private Animation b;

    public yyq(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.yyj, defpackage.yyo
    public final Animation b() {
        if (this.b == null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.a, 17432576);
            this.b = loadAnimation;
            loadAnimation.setDuration(this.a.getResources().getInteger(17694720));
        }
        return this.b;
    }

    @Override // defpackage.yyj, defpackage.yyo
    public final boolean c() {
        return true;
    }
}
