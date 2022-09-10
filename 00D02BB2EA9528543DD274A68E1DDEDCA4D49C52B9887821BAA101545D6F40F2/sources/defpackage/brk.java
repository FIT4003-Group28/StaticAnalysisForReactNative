package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: brk  reason: default package */
/* loaded from: classes.dex */
public final class brk extends ContextWrapper {
    static final bsb<?, ?> a = new bra();
    public final bxl b;
    public final bru c;
    public final List<chv<Object>> d;
    public final Map<Class<?>, bsb<?, ?>> e;
    public final bwl f;
    public final brn g;
    public final int h;
    private final brb i;
    private chw j;

    public brk(Context context, bxl bxlVar, bru bruVar, brb brbVar, Map<Class<?>, bsb<?, ?>> map, List<chv<Object>> list, bwl bwlVar, brn brnVar) {
        super(context.getApplicationContext());
        this.b = bxlVar;
        this.c = bruVar;
        this.i = brbVar;
        this.d = list;
        this.e = map;
        this.f = bwlVar;
        this.g = brnVar;
        this.h = 4;
    }

    public final synchronized chw a() {
        if (this.j == null) {
            chw a2 = this.i.a();
            a2.G();
            this.j = a2;
        }
        return this.j;
    }
}
