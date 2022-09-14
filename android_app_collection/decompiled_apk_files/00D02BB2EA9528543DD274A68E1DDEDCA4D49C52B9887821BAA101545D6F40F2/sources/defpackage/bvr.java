package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: bvr  reason: default package */
/* loaded from: classes4.dex */
public final class bvr<DataType> {
    private final btl<DataType> a;
    private final DataType b;
    private final bua c;

    public bvr(btl<DataType> btlVar, DataType datatype, bua buaVar) {
        this.a = btlVar;
        this.b = datatype;
        this.c = buaVar;
    }

    public final boolean a(File file) {
        return this.a.a(this.b, file, this.c);
    }
}
