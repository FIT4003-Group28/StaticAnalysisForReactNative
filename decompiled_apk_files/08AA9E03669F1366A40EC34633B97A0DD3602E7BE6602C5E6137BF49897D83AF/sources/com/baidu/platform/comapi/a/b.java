package com.baidu.platform.comapi.a;

import com.baidu.mapapi.http.HttpClient;
import com.baidu.platform.comapi.a.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends HttpClient.ProtoResultCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a.InterfaceC0037a f1986a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f1987b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, a.InterfaceC0037a interfaceC0037a) {
        this.f1987b = aVar;
        this.f1986a = interfaceC0037a;
    }

    @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
    public void onFailed(HttpClient.HttpStateError httpStateError) {
        this.f1986a.a(httpStateError);
    }

    @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
    public void onSuccess(String str) {
        c a2;
        a.InterfaceC0037a interfaceC0037a = this.f1986a;
        a2 = this.f1987b.a(str);
        interfaceC0037a.a((a.InterfaceC0037a) a2);
    }
}
