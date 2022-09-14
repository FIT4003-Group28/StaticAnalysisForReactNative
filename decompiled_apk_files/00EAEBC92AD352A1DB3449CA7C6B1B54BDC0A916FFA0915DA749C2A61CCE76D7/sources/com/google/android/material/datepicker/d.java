package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
/* loaded from: classes.dex */
public interface d<S> extends Parcelable {
    View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, l<S> lVar);

    String a(Context context);

    int b(Context context);

    void b(long j);

    Collection<androidx.core.util.d<Long, Long>> f();

    boolean g();

    Collection<Long> h();

    S i();
}
