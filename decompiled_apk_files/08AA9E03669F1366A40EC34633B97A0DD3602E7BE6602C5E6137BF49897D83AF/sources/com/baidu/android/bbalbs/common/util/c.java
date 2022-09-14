package com.baidu.android.bbalbs.common.util;

import com.baidu.android.bbalbs.common.util.b;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements Comparator<b.a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f1482a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b bVar) {
        this.f1482a = bVar;
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(b.a aVar, b.a aVar2) {
        int i = aVar2.f1476b - aVar.f1476b;
        if (i == 0) {
            if (aVar.f1478d && aVar2.f1478d) {
                return 0;
            }
            if (aVar.f1478d) {
                return -1;
            }
            if (aVar2.f1478d) {
                return 1;
            }
        }
        return i;
    }
}
