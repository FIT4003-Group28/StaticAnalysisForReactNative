package com.baidu.lbsapi.auth;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f1492a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(e eVar) {
        this.f1492a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list;
        e eVar = this.f1492a;
        list = this.f1492a.f1490b;
        eVar.a(list);
    }
}
