package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cfx  reason: default package */
/* loaded from: classes.dex */
public final class cfx {
    private final List<cfw<?, ?>> a = new ArrayList();

    public final synchronized <Z, R> void a(Class<Z> cls, Class<R> cls2, cfv<Z, R> cfvVar) {
        this.a.add(new cfw<>(cls, cls2, cfvVar));
    }

    public final synchronized <Z, R> cfv<Z, R> b(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return cfy.a;
        }
        for (cfw<?, ?> cfwVar : this.a) {
            if (cfwVar.a(cls, cls2)) {
                return (cfv<Z, R>) cfwVar.a;
            }
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(cls2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
        sb.append("No transcoder registered to transcode from ");
        sb.append(valueOf);
        sb.append(" to ");
        sb.append(valueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final synchronized <Z, R> List<Class<R>> c(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (cfw<?, ?> cfwVar : this.a) {
            if (cfwVar.a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
