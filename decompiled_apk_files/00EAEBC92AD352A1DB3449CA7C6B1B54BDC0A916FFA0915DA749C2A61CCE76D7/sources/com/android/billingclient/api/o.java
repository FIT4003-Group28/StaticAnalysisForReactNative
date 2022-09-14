package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private String f5102a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f5103b;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f5104a;

        /* renamed from: b  reason: collision with root package name */
        private List<String> f5105b;

        private b() {
        }

        public b a(String str) {
            this.f5104a = str;
            return this;
        }

        public b a(List<String> list) {
            this.f5105b = new ArrayList(list);
            return this;
        }

        public o a() {
            o oVar = new o();
            oVar.f5102a = this.f5104a;
            oVar.f5103b = this.f5105b;
            return oVar;
        }
    }

    public static b c() {
        return new b();
    }

    public String a() {
        return this.f5102a;
    }

    public List<String> b() {
        return this.f5103b;
    }
}
