package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bpbv  reason: default package */
/* loaded from: classes3.dex */
final class bpbv implements DialogInterface.OnClickListener {
    final /* synthetic */ bpbw a;

    public bpbv(bpbw bpbwVar) {
        this.a = bpbwVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a.E(bomu.ADDRESS, true, this.a.al.c());
    }
}
