package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cyfe  reason: default package */
/* loaded from: classes5.dex */
public final class cyfe {
    public static final List<cyfe> a = new ArrayList();
    public static final cyfe b;
    public static final cyfe c;
    public final int d;
    public final String e;

    static {
        new cyfe("firstDummyExperiment");
        new cyfe("secondDummyExperiment");
        new cyfe("requestMaskIncludeContainers");
        b = new cyfe("rankContactsUsingFieldLevelSignals");
        c = new cyfe("emptyQueryCache");
    }

    private cyfe(String str) {
        List<cyfe> list = a;
        this.d = list.size();
        this.e = str;
        list.add(this);
    }
}
