package j$.util.stream;

import j$.util.Spliterator;
/* loaded from: classes5.dex */
interface TerminalOp {
    /* renamed from: evaluateParallel */
    Object mo511evaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator);

    /* renamed from: evaluateSequential */
    Object mo512evaluateSequential(PipelineHelper pipelineHelper, Spliterator spliterator);

    int getOpFlags();

    StreamShape inputShape();

    /* renamed from: j$.util.stream.TerminalOp$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class CC {
        public static int $default$getOpFlags(TerminalOp terminalOp) {
            return 0;
        }
    }
}
