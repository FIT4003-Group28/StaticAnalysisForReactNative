package com.facebook.react.uimanager;

import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewAtIndex.java */
/* loaded from: classes.dex */
public class ap {

    /* renamed from: a  reason: collision with root package name */
    public static Comparator<ap> f3812a = new Comparator<ap>() { // from class: com.facebook.react.uimanager.ap.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(ap apVar, ap apVar2) {
            return apVar.f3814c - apVar2.f3814c;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final int f3813b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3814c;

    public ap(int i, int i2) {
        this.f3813b = i;
        this.f3814c = i2;
    }
}
