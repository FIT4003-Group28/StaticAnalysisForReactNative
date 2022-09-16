package defpackage;

import java.io.ObjectInputStream;
import java.nio.charset.CharsetEncoder;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dhgj  reason: default package */
/* loaded from: classes6.dex */
public final class dhgj extends dhgl<String> {
    private static final long serialVersionUID = 855555582;
    public final String a = "UTF-8";
    private transient ThreadLocal<CharsetEncoder> b;

    public dhgj() {
        a();
        this.b.get();
    }

    private final void a() {
        this.b = new dhgh(this);
        new dhgi(this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        a();
    }
}
