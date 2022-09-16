package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;
/* loaded from: classes.dex */
public class HermesExecutor extends JavaScriptExecutor {

    /* renamed from: a  reason: collision with root package name */
    private static String f5185a;

    static {
        SoLoader.a("hermes");
        try {
            SoLoader.a("hermes-executor-debug");
            f5185a = "Debug";
        } catch (UnsatisfiedLinkError unused) {
            SoLoader.a("hermes-executor-release");
            f5185a = "Release";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HermesExecutor(b bVar) {
        super(bVar == null ? initHybridDefaultConfig() : initHybrid(bVar.f5187a, bVar.f5188b, bVar.f5189c));
    }

    public static native boolean canLoadFile(String str);

    private static native HybridData initHybrid(long j, boolean z, int i);

    private static native HybridData initHybridDefaultConfig();

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "HermesExecutor" + f5185a;
    }
}
