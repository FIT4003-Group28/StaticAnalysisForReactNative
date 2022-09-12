package defpackage;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bjgt  reason: default package */
/* loaded from: classes3.dex */
public final class bjgt implements Serializable {
    public final Set<String> a = new HashSet();

    public final boolean a(String str) {
        return this.a.contains(str);
    }
}
