package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bnvx  reason: default package */
/* loaded from: classes3.dex */
final class bnvx {
    final String a;
    Class<?> b;
    Field c;
    Method d;
    Method e;
    Method f;
    boolean g;
    boolean h;
    @dzsi
    String i;

    public bnvx(String str) {
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Class<?> cls) {
        Class<?> cls2 = this.b;
        if (cls2 != null) {
            if (cls2 != cls) {
                throw new RuntimeException(String.format(Locale.US, "Multiple attribute types %s and %s defined for %s", this.b.getName(), cls.getName(), this.a));
            }
        } else if (!bnvy.e.contains(cls) && !cls.isEnum()) {
            throw new RuntimeException(String.format(Locale.US, "Invalid attribute type %s for %s", cls.getName(), this.a));
        } else {
            this.b = cls;
        }
    }
}
