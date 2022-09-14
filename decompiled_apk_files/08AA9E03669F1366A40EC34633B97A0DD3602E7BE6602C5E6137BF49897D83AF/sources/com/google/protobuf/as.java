package com.google.protobuf;

import java.util.List;
/* compiled from: UninitializedMessageException.java */
/* loaded from: classes.dex */
public class as extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f4375a;

    public as(ac acVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f4375a = null;
    }

    public as(List<String> list) {
        super(a(list));
        this.f4375a = list;
    }

    public u a() {
        return new u(getMessage());
    }

    private static String a(List<String> list) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
