package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bacn  reason: default package */
/* loaded from: classes2.dex */
public final class bacn {
    private final List a = new ArrayList(1);

    public final synchronized boolean a(int i) {
        if (this.a.size() >= 256) {
            return false;
        }
        this.a.add(Integer.valueOf(i));
        return true;
    }
}
