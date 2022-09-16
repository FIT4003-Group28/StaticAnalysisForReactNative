package defpackage;

import com.google.android.gms.cast.ApplicationMetadata;
import java.util.HashSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qks  reason: default package */
/* loaded from: classes4.dex */
public final class qks extends tfo {
    final /* synthetic */ qku a;

    public qks(qku qkuVar) {
        this.a = qkuVar;
    }

    @Override // defpackage.tfo
    public final void a(int i) {
        for (tfo tfoVar : new HashSet(this.a.a)) {
            tfoVar.a(i);
        }
    }

    @Override // defpackage.tfo
    public final void b(int i) {
        this.a.d(i);
        this.a.n(i);
        for (tfo tfoVar : new HashSet(this.a.a)) {
            tfoVar.b(i);
        }
    }

    @Override // defpackage.tfo
    public final void c(ApplicationMetadata applicationMetadata) {
        for (tfo tfoVar : new HashSet(this.a.a)) {
            tfoVar.c(applicationMetadata);
        }
    }

    @Override // defpackage.tfo
    public final void d() {
        for (tfo tfoVar : new HashSet(this.a.a)) {
            tfoVar.d();
        }
    }

    @Override // defpackage.tfo
    public final void e(int i) {
        for (tfo tfoVar : new HashSet(this.a.a)) {
            tfoVar.e(i);
        }
    }

    @Override // defpackage.tfo
    public final void f() {
        for (tfo tfoVar : new HashSet(this.a.a)) {
            tfoVar.f();
        }
    }
}
