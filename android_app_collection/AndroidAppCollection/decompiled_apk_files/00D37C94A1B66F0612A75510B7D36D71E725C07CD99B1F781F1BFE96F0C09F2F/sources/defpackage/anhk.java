package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: anhk  reason: default package */
/* loaded from: classes.dex */
public final class anhk extends ampf implements Serializable {
    public static final anhk a = new anhk();
    private static final long serialVersionUID = 1;

    private anhk() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.ampf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((Integer) obj).toString();
    }

    @Override // defpackage.ampf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        return Integer.decode((String) obj);
    }

    public final String toString() {
        return "Ints.stringConverter()";
    }
}
