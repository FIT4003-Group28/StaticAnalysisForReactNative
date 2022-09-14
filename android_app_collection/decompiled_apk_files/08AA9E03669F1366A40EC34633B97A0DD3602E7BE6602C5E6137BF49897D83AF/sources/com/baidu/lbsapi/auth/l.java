package com.baidu.lbsapi.auth;

import com.baidu.lbsapi.auth.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l implements e.a<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f1508a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h f1509b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(h hVar, String str) {
        this.f1509b = hVar;
        this.f1508a = str;
    }

    @Override // com.baidu.lbsapi.auth.e.a
    public void a(String str) {
        this.f1509b.a(str, this.f1508a);
    }
}
