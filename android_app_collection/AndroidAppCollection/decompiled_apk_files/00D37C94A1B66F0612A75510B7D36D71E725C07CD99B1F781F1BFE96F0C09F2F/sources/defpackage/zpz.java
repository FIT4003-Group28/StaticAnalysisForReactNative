package defpackage;

import android.os.Handler;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.ProcessorBase;
/* compiled from: PG */
/* renamed from: zpz  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zpz implements ProcessorBase.Callback {
    public final /* synthetic */ zqq a;
    public final /* synthetic */ Effect b;

    public /* synthetic */ zpz(zqq zqqVar, Effect effect) {
        this.a = zqqVar;
        this.b = effect;
    }

    @Override // com.google.research.xeno.effect.ProcessorBase.Callback
    public final void onCompletion(boolean z, String str) {
        zqq zqqVar = this.a;
        Effect effect = this.b;
        if (!z) {
            String valueOf = String.valueOf(str);
            zep.b(valueOf.length() != 0 ? "Error setting Xeno effect. ".concat(valueOf) : new String("Error setting Xeno effect. "));
            String obj = effect.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 58 + String.valueOf(str).length());
            sb.append("VideoEffectPipelineDrishti::setXenoEffect ERROR: ");
            sb.append(obj);
            sb.append(", error: ");
            sb.append(str);
            zqqVar.s(sb.toString());
        } else if (effect == null || effect.a() == null) {
        } else {
            boolean z2 = zqqVar.b;
            int intValue = effect.a().intValue();
            Handler handler = zqqVar.i.b;
            handler.sendMessage(handler.obtainMessage(12, Integer.valueOf(intValue + (!z2 ? 1 : 0))));
            String valueOf2 = String.valueOf(effect.toString());
            zqqVar.s(valueOf2.length() != 0 ? "VideoEffectPipelineDrishti::setXenoEffect SUCCESS: ".concat(valueOf2) : new String("VideoEffectPipelineDrishti::setXenoEffect SUCCESS: "));
        }
    }
}
