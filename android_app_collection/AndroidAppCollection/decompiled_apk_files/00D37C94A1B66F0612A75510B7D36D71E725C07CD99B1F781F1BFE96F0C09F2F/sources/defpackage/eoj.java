package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: eoj  reason: default package */
/* loaded from: classes3.dex */
public final class eoj {
    private final Context a;

    public eoj(Context context) {
        this.a = context;
    }

    private final yvn c() {
        amtw amtwVar = new amtw();
        amtwVar.c(this.a.getString(R.string.off), eoe.BACKGROUND_AUDIO_POLICY_OFF);
        amtwVar.c(this.a.getString(R.string.on_if_hh), eoe.BACKGROUND_AUDIO_POLICY_ON_IF_HEADPHONES);
        amtwVar.c(this.a.getString(R.string.on), eoe.BACKGROUND_AUDIO_POLICY_ON);
        return new yvn(this.a.getString(R.string.background_audio_policy_default), eoe.BACKGROUND_AUDIO_POLICY_UNSPECIFIED, amtwVar.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final eoe a(String str) {
        return (eoe) c().a.apply(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b(eoe eoeVar) {
        return (String) c().b.apply(eoeVar);
    }
}
