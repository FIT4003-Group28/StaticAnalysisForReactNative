package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dtz  reason: default package */
/* loaded from: classes3.dex */
public final class dtz extends dux {
    private static final duy h = new duy();
    private final Context i;

    public dtz(dtq dtqVar, aopa aopaVar, int i, Context context) {
        super(dtqVar, "wKbXKo9FRYpF651/RXEAmUYW7OjT2JV8KmXbjruZd9ws7bCFI7lAUfA4vcIc8kFF", "EmX1KyH+75fHxL5GikSeUFMFtWZZrwDC1LRg9yOk6Q4=", aopaVar, i, 29);
        this.i = context;
    }

    @Override // defpackage.dux
    protected final void a() {
        aopa aopaVar = this.g;
        aopaVar.copyOnWrite();
        dnw dnwVar = (dnw) aopaVar.instance;
        dnw dnwVar2 = dnw.a;
        dnwVar.b |= 16777216;
        dnwVar.t = "E";
        AtomicReference a = h.a(this.i.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.d.invoke(null, this.i));
                }
            }
        }
        String str = (String) a.get();
        synchronized (this.g) {
            aopa aopaVar2 = this.g;
            String j = ehi.j(str.getBytes(), true);
            aopaVar2.copyOnWrite();
            dnw dnwVar3 = (dnw) aopaVar2.instance;
            j.getClass();
            dnwVar3.b = 16777216 | dnwVar3.b;
            dnwVar3.t = j;
        }
    }
}
