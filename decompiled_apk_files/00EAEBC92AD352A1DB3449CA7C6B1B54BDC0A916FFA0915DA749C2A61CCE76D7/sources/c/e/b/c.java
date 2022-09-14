package c.e.b;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements c.e.b.n.a {

    /* renamed from: a  reason: collision with root package name */
    private final d f4816a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4817b;

    private c(d dVar, Context context) {
        this.f4816a = dVar;
        this.f4817b = context;
    }

    public static c.e.b.n.a a(d dVar, Context context) {
        return new c(dVar, context);
    }

    @Override // c.e.b.n.a
    public Object get() {
        return d.a(this.f4816a, this.f4817b);
    }
}
