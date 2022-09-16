package defpackage;

import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: wdr  reason: default package */
/* loaded from: classes4.dex */
final class wdr extends akjk {
    private final wdv h;
    private final wbi i;
    private final boolean j;
    private final aafo k;

    public wdr(SwitchPreference switchPreference, akjl akjlVar, akjm akjmVar, aurg aurgVar, wdv wdvVar, wbi wbiVar, aafo aafoVar, boolean z) {
        super(switchPreference, akjlVar, akjmVar, aurgVar);
        this.h = wdvVar;
        this.i = wbiVar;
        this.j = z;
        this.k = aafoVar;
    }

    @Override // defpackage.akjk, defpackage.bjf
    public final boolean a(Preference preference, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            apzg apzgVar = this.b.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (apzgVar.qn(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand)) {
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.i);
                aafo aafoVar = this.k;
                apzg apzgVar2 = this.b.h;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar.c(apzgVar2, hashMap);
                return false;
            }
        }
        boolean a = super.a(preference, obj);
        this.h.a(this.j, !((TwoStatePreference) this.a).a);
        return a;
    }
}
