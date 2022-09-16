package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: slh  reason: default package */
/* loaded from: classes4.dex */
public final class slh {
    public static final amzy a = amzy.l("com/google/android/libraries/assistant/appintegration/AssistantConfig");
    public final List b;
    public final ampq c;
    public final ampq d;

    public slh(smf smfVar) {
        ampq ampqVar;
        this.b = smfVar.c;
        aopu aopuVar = smfVar.d;
        aopq aopqVar = smfVar.h;
        if ((smfVar.b & 1) != 0) {
            ampq.j(smfVar.e);
        }
        if ((smfVar.b & 2) != 0) {
            ampqVar = ampq.j(smfVar.f);
        } else {
            ampqVar = amon.a;
        }
        this.c = ampqVar;
        if ((smfVar.b & 4) != 0) {
            ampq.j(Boolean.valueOf(smfVar.g));
        }
        this.d = (smfVar.b & 8) != 0 ? ampq.j(Boolean.valueOf(smfVar.i)) : amon.a;
    }

    public static ankt a(Context context) {
        return amnt.d(new slg(context), anlz.e(Executors.newSingleThreadExecutor()));
    }
}
