package defpackage;

import android.os.Handler;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aknq  reason: default package */
/* loaded from: classes.dex */
public final class aknq {
    private static final Set d = EnumSet.allOf(aknp.class);
    public final aklx a;
    public final Set b;
    public boolean c;
    private final Handler e;

    public aknq(aklx aklxVar, Handler handler) {
        aklxVar.getClass();
        this.a = aklxVar;
        handler.getClass();
        this.e = handler;
        this.b = EnumSet.noneOf(aknp.class);
    }

    public final void a(aknp... aknpVarArr) {
        this.b.addAll(Arrays.asList(aknpVarArr));
        if (!this.c && this.b.containsAll(d)) {
            this.e.post(new akno(this));
            this.c = true;
        }
    }
}
