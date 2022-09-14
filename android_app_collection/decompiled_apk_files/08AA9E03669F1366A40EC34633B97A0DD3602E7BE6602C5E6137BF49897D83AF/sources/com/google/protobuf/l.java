package com.google.protobuf;

import com.google.protobuf.ac;
import com.google.protobuf.j;
/* compiled from: Extension.java */
/* loaded from: classes.dex */
public abstract class l<ContainingType extends ac, Type> extends m<ContainingType, Type> {

    /* compiled from: Extension.java */
    /* loaded from: classes.dex */
    protected enum a {
        IMMUTABLE,
        MUTABLE,
        PROTO1
    }

    public abstract j.f a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object b(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.m
    public final boolean b() {
        return false;
    }
}
