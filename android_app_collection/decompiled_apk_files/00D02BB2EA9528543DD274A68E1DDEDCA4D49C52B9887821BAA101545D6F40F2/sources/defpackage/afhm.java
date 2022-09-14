package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: afhm  reason: default package */
/* loaded from: classes.dex */
public abstract class afhm extends afhx {
    private final boolean a;

    public afhm(Intent intent, @dzsi String str, afid afidVar, Context context) {
        super(intent, str, afidVar);
        this.a = afiq.c(context, intent);
        if (!intent.hasExtra("GMM_ENABLE_ONE_BACK_TAP")) {
            intent.putExtra("GMM_ENABLE_ONE_BACK_TAP", true);
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return this.a;
    }
}
