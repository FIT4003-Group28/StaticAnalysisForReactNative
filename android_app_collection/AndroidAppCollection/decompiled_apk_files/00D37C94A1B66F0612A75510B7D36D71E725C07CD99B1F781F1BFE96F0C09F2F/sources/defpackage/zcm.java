package defpackage;

import androidx.preference.TwoStatePreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
/* compiled from: PG */
/* renamed from: zcm  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zcm implements ampg {
    public final /* synthetic */ ProtoDataStoreSwitchPreference a;
    private final /* synthetic */ int b;

    public /* synthetic */ zcm(ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference, int i) {
        this.b = i;
        this.a = protoDataStoreSwitchPreference;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            Void r2 = (Void) obj;
            return Boolean.valueOf(((TwoStatePreference) this.a).a);
        }
        this.a.aj((Boolean) obj);
        return null;
    }
}
