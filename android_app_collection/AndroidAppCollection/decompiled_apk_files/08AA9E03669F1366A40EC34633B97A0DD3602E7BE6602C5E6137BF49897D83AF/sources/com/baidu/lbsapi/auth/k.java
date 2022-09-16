package com.baidu.lbsapi.auth;

import com.baidu.lbsapi.auth.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k implements c.a<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f1506a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h f1507b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(h hVar, String str) {
        this.f1507b = hVar;
        this.f1506a = str;
    }

    @Override // com.baidu.lbsapi.auth.c.a
    public void a(String str) {
        this.f1507b.a(str, this.f1506a);
    }
}
