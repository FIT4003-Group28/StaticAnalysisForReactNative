package com.google.android.libraries.social.peoplekit.common.dataservice;

import android.content.Context;
import android.os.Parcelable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* loaded from: classes5.dex */
public interface PeopleKitDataLayer extends Parcelable {
    void c(cxri cxriVar);

    void d(cxri cxriVar);

    void e();

    void f(Channel channel);

    void g(Channel channel);

    void h(Channel channel);

    void i(Set<Channel> set);

    void j(int i, Set<Channel> set);

    void k();

    void l(String str);

    void m();

    Channel n(czha czhaVar);

    Channel o(String str, Context context);

    Channel p(String str, String str2, Context context);

    void q(Channel channel, cxrh cxrhVar);

    void r(boolean z);

    void s(Context context, ExecutorService executorService, cxqo cxqoVar, cxrj cxrjVar);

    void t(List<Channel> list, List<Channel> list2, cxpc cxpcVar);

    cxsl u();
}
