package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: bzu  reason: default package */
/* loaded from: classes.dex */
public class bzu<Data> implements caq<File, Data> {
    private final bzy<Data> a;

    public bzu(bzy<Data> bzyVar) {
        this.a = bzyVar;
    }

    @Override // defpackage.caq
    public final cap<File, Data> a(caz cazVar) {
        return new cab(this.a);
    }

    @Override // defpackage.caq
    public final void b() {
    }
}
