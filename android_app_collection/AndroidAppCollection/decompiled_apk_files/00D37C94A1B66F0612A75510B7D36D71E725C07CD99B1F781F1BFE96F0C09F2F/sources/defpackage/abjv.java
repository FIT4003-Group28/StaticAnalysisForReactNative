package defpackage;

import com.google.protos.youtube.api.innertube.ToggleConversationActionOuterClass$ToggleConversationAction;
/* compiled from: PG */
/* renamed from: abjv  reason: default package */
/* loaded from: classes.dex */
public final class abjv extends aabp {
    private final ToggleConversationActionOuterClass$ToggleConversationAction a;

    private abjv(ampq ampqVar, ToggleConversationActionOuterClass$ToggleConversationAction toggleConversationActionOuterClass$ToggleConversationAction) {
        super(ampqVar);
        toggleConversationActionOuterClass$ToggleConversationAction.getClass();
        this.a = toggleConversationActionOuterClass$ToggleConversationAction;
    }

    public static abjv a(ampq ampqVar, ToggleConversationActionOuterClass$ToggleConversationAction toggleConversationActionOuterClass$ToggleConversationAction) {
        return new abjv(ampqVar, toggleConversationActionOuterClass$ToggleConversationAction);
    }

    public boolean b() {
        return this.a.c;
    }
}
