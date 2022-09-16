package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: io  reason: default package */
/* loaded from: classes6.dex */
public final class io {
    public CharSequence a;
    private final String b;
    private final Set<String> c = new HashSet();
    private final Bundle d = new Bundle();

    public io(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("Result key can't be null");
    }

    public final ip a() {
        return new ip(this.b, this.a, this.d, this.c);
    }
}
