# Practical Design Patterns: Applied Engineering Lab

| Task | Patterns | Idea |
|---|---|---|
| 1 | Strategy + Decorator | `ReportFormatter` (JSON/CSV) chooses format; `HeaderFooterDecorator` and `Base64EncryptDecorator` wrap an `Exporter` at runtime. |
| 2 | Adapter + Proxy | `StockFeedAdapter` parses the legacy `K=V;` packet; `CachedStockProxy` adds a TTL cache in front. |
| 3 | Bridge + Strategy | `Alert` (abstraction) is independent of `MessageChannel` (implementor); `DispatchStrategy` gates delivery. |
| 4 | Adapter + Decorator | `CurrencyOrderAdapter` converts GBP to USD; stackable fee decorators add surcharges. |
| 5 | Bridge + Proxy | `DigitalAsset` is independent of `StorageDriver`; `StorageDriverProxy` enforces role-based access. |

## Build and run
```
javac -d out src/task*/*.java
java -cp out task1.Task1Runner   # ... task5.Task5Runner
```
