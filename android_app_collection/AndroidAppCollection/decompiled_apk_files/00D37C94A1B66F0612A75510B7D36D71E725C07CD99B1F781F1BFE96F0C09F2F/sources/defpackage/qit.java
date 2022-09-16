package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Set;
/* compiled from: PG */
/* renamed from: qit  reason: default package */
/* loaded from: classes4.dex */
public final class qit implements qsm {
    public static final qit a = new qit(new Bundle());
    public final Bundle b;

    public qit(Bundle bundle) {
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qit)) {
            return false;
        }
        Bundle bundle = this.b;
        Bundle bundle2 = ((qit) obj).b;
        if (bundle.size() == bundle2.size()) {
            Set<String> keySet = bundle.keySet();
            if (keySet.containsAll(bundle2.keySet())) {
                for (String str : keySet) {
                    if (!tnk.j(bundle.get(str), bundle2.get(str))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }
}
